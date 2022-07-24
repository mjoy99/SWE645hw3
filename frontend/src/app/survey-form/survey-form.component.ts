import { Component, OnInit } from '@angular/core';

import { Survey } from '../surveys-display/survey';
import { SurveyFormService } from './survey-form.service';
import { SurveysDisplayService } from '../surveys-display/surveys-display.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-survey-form',
  templateUrl: './survey-form.component.html',
  providers: [SurveyFormService,SurveysDisplayService],
  styleUrls: ['./survey-form.component.css']
})

export class SurveyFormComponent implements OnInit {

  constructor(private formService: SurveyFormService, 
              private surveysDisplayService: SurveysDisplayService,
              private router: Router) { }

  model = {
    fname : '',
    lname : '',
    telephone : '',
    email : '',
    surveydate: '',
    referral : '',
    satisfaction: '',
    qualities : [''],
    address: {
      street: '',
      city: '',
      state: '',
      zip: ''
    }
  }
  surveys: Survey[]=[];

  satisfaction = ['Very Likely', 'Likely', 'Unlikely'];
  referral = ['friends', 'television', 'Internet', 'other'];
  qualities = ['students', 'location', 'campus', 'atmosphere', 'dorm', 'rooms',  'sport'];

  ngOnInit(): void {
    this.getSurveys();
  }

  onQualChange(e: any, item: string){
    if (e.target.checked){
      this.model.qualities.push(item);
    }
    else {
      this.model.qualities.splice(this.model.qualities.indexOf(item),1);
    }
  }

  onSubmit(){
    if (this.model.qualities[0]=='' && this.model.qualities.length>1){
      this.model.qualities.splice(0,1);
    }
    
    const newSurvey = {
      survey_id : NaN,
      first_name : this.model.fname,
      last_name : this.model.lname,
      street: this.model.address.street,
      city: this.model.address.city,
      state: this.model.address.state,
      zip: this.model.address.zip,
      phone_number : this.model.telephone,
      email : this.model.email,
      date: this.model.surveydate,
      like_students: 0,
      like_location: 0,
      like_campus: 0,
      like_atmosphere: 0,
      like_dorm_rooms: 0,
      like_sports: 0,
      interest: this.model.satisfaction,
      will_recommend : this.model.referral
    };

    
    this.formService
      .addSurvey(newSurvey)
      .subscribe(survey=>console.log(survey));

   this.getSurveys();

   this.router.navigateByUrl('/survey-list');
  }

  addSurvey(): void {}

  getSurveys(): void {
    this.surveysDisplayService.getSurveys()
      .subscribe(surveys => (this.surveys=surveys));
  }


  

}

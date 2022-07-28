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
    address: '',
    street: '',
    city: '',
    state: '',
    zip: ''
    
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
      id : NaN,
      fname : this.model.fname,
      lname : this.model.lname,
      telephone : this.model.telephone,
      email : this.model.email,
      surveydate: this.model.surveydate,
      referral : this.model.referral,
      satisfaction: this.model.satisfaction,
      qualities : this.model.qualities,
      address: this.model.address,
      city: this.model.city,
      state: this.model.state,
      zip: this.model.zip
    };

    this.formService
      .addSurvey(newSurvey)
      .subscribe(survey=>console.log(survey));
      
   this.getSurveys();

   this.router.navigateByUrl('/survey-list');
  }

  addSurvey(): void { }

  getSurveys(): void {
    this.surveysDisplayService.getSurveys()
      .subscribe(surveys => (this.surveys=surveys));
  }


  

}

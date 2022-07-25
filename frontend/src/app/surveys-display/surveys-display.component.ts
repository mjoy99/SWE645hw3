import { Component, OnInit } from '@angular/core';

import { Survey } from './survey';
import { SurveysDisplayService } from './surveys-display.service';

@Component({
  selector: 'app-survey',
  templateUrl: './surveys-display.component.html',
  providers:[SurveysDisplayService],
  styleUrls: ['./surveys-display.component.css']
})

export class SurveysDisplayComponent implements OnInit {
  surveys:Survey[]=[];

  constructor(private surveysDisplayService:SurveysDisplayService) { }

  ngOnInit(): void {
    this.getSurveys();
  }

  getSurveys(): void {
    this.surveysDisplayService.getSurveys()
      .subscribe(surveys => (this.surveys=surveys));
  }

  

}

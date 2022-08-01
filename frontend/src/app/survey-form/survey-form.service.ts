import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';

import { Survey } from '../surveys-display/survey'
import { HttpErrorHandler, HandleError } from '../http-error-handler.services';

import { environment } from '../../environments/environment';
import { AppConfig } from '../app.service';


@Injectable({
  providedIn: 'root'
})
export class SurveyFormService {
  
 private baseUrl = '';
 private surveyURL = '';
 
  private handleError: HandleError;
  
  constructor(
    private http: HttpClient, 
    httpErrorHandler: HttpErrorHandler, 
    private appConfig: AppConfig) {
      this.handleError = httpErrorHandler.createHandleError('SurveysService');
      environment.production ? this.baseUrl = appConfig.baseURL :
      this.baseUrl=environment.baseUrl;
      this.surveyURL = this.baseUrl + '/surveys'; 
     }

     //add survey to server
     addSurvey(survey: Survey): Observable<Survey>{
      return this.http.post<Survey>(this.surveyURL, survey)
       .pipe(
         catchError(this.handleError('addSurvey',survey))
       );
     }
}

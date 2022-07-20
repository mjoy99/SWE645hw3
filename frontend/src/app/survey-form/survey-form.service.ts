import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';

import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';

import { Survey } from '../surveys-display/survey'
import { HttpErrorHandler, HandleError } from '../http-error-handler.services';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    Authorization: 'my-auth-token'
  })
};

@Injectable({
  providedIn: 'root'
})
export class SurveyFormService {


  surveysURL='api/surveys/';
  private handleError: HandleError;
  
  constructor(
    private http: HttpClient, 
    httpErrorHandler: HttpErrorHandler) {
      this.handleError = httpErrorHandler.createHandleError('SurveysService');
     }


     //add survey to server
     addSurvey(survey: Survey): Observable<Survey>{
      return this.http.post<Survey>(this.surveysURL, survey, httpOptions)
       .pipe(
         catchError(this.handleError('addSurvey',survey))
       );
     }
}

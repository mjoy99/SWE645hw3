import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';

import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';

import { Survey } from './survey';
import { HttpErrorHandler, HandleError } from '../http-error-handler.services';

import { environment } from '../../environments/environment';
import { AppConfig } from '../app.service';


@Injectable({
  providedIn: 'root'
})
export class SurveysDisplayService {

  
  private baseUrl = '';
  private surveyURL = '';

  private handleError: HandleError;
  
  constructor(
    private http: HttpClient, 
    httpErrorHandler: HttpErrorHandler, 
    private appConfig: AppConfig) {
      this.handleError = httpErrorHandler.createHandleError('DisplayService');
      environment.production ? this.baseUrl = appConfig.baseURL :
      this.baseUrl=environment.baseUrl;
      this.surveyURL = this.baseUrl + '/surveys'; 
    }

     //retrieve surveys from server
     getSurveys(): Observable<Survey[]>{
      return this.http.get<Survey[]>(this.surveyURL).pipe(
        catchError(this.handleError('getSurveys', []))
      );
     }

}

import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';

import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';

import { Survey } from './survey';
import { HttpErrorHandler, HandleError } from '../http-error-handler.services';

import { environment } from '../../environments/environment';


@Injectable({
  providedIn: 'root'
})
export class SurveysDisplayService {

  surveysURL=environment.baseUrl+'api/surveys/';
  private handleError: HandleError;
  
  constructor(
    private http: HttpClient, 
    httpErrorHandler: HttpErrorHandler) {
      this.handleError = httpErrorHandler.createHandleError('DisplayService');
     }

     //retrieve surveys from server
     getSurveys(): Observable<Survey[]>{
      return this.http.get<Survey[]>(this.surveysURL)
      .pipe(
        catchError(this.handleError('getSurveys', []))
      );
     }

}

import { NgModule, APP_INITIALIZER } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { HttpClientInMemoryWebApiModule } from 'angular-in-memory-web-api';
import { InMemoryDataService } from './in-memory-data.service';

import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { SurveyFormComponent } from './survey-form/survey-form.component';
import { SurveysDisplayComponent } from './surveys-display/surveys-display.component';
import { HttpErrorHandler } from './http-error-handler.services';
import { PageNotFoundComponent } from './pagenotfound/pagenotfound.component';
import { HomeComponent } from './home/home.component';
import { environment } from './../environments/environment';
import { AppConfig, initConfig } from './app.service';


@NgModule({
  declarations: [
    AppComponent,
    SurveyFormComponent,
    SurveysDisplayComponent,
    PageNotFoundComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path: 'survey-list', component: SurveysDisplayComponent},
      {path: 'survey', component: SurveyFormComponent},
      {path: '', component: HomeComponent},
      {path: '**', component: PageNotFoundComponent}
    ]),
    CommonModule,
    FormsModule,
    HttpClientModule,
    environment.production ? []: HttpClientInMemoryWebApiModule.forRoot(InMemoryDataService)
  ],
  providers: [
    HttpErrorHandler,
    AppConfig,
    {
      provide: APP_INITIALIZER, 
      useFactory: initConfig, 
      deps: [ AppConfig ], 
      multi: true
  },
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

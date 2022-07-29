import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../environments/environment';
import {firstValueFrom} from 'rxjs';

interface Config{
  url: string;
}

export interface IAppConfig{
  baseURL:string;
  load: () => Promise<void>;
}


@Injectable()
export class AppConfig implements IAppConfig {
 public baseURL= '';

    constructor(private readonly http: HttpClient) { }

    public load(): Promise<void> {
        return this.http
        .get<Config>('assets/config.json')
        .toPromise()
        .then(config=>{
          this.baseURL=config.url;
        });
    } 
  
}
export  function initConfig(config: AppConfig): () => Promise<void> {
    return () => config.load();
}

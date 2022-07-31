import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


interface Config{
  url: string;
}

export interface IAppConfig{
  baseURL:string;
  load: () => Promise<any>;
}


@Injectable()
export class AppConfig implements IAppConfig {
 public baseURL= '';

    constructor(private readonly http: HttpClient) { }

    public load(): Promise<any> {
        return new Promise((resolve, reject)=>{
          this.http.get<Config>('assets/config.json')
          .subscribe((response:any)=>{
            this.baseURL = response?.url;
            resolve(true);
          });
        });
    } 
  
}
export  function initConfig(config: AppConfig): () => Promise<void> {
    return () => config.load();
}

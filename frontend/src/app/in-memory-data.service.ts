import { Injectable } from '@angular/core';
import { InMemoryDbService } from 'angular-in-memory-web-api';

@Injectable({
  providedIn: 'root'
})

export class InMemoryDataService implements InMemoryDbService {
  createDb() {
      const surveys = [
        { id: 1,
          fname: 'In Memory',
          lname: 'API',
          address: {
            street: 'string',
            city: 'string',
            state: 'string',
            zip: 23022},
          telephone: 'xxx-xxx-xxxx',
          email: 'string@gmu.edu',
          surveydate: '7/1/12',
          referral: 'Likely',
          satisfaction: 'Happy',
          qualities: ['campus','sports']
         },
         { id: 2,
          fname: 'Mo',
          lname: 'Joy',
          address: {
            street: 'string',
            city: 'string',
            state: 'string',
            zip: 23022},
          telephone: 'xxx-xxx-xxxx',
          email: 'string@gmu.edu',
          surveydate: '7/1/12',
          referral: 'Likely',
          satisfaction: 'Happy',
          qualities: ['campus','sports']
         }
      ];
      return {surveys};
  }

  

}

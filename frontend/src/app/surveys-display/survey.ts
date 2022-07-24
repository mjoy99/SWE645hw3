export interface Survey {
   

     id: number;
     fname: string;
     lname: string;
     address: Address;
     telephone: string;
     email: string;
     surveydate: any;
     referral: string;
     satisfaction: string;
     qualities: string[];
    
  }

  export interface Address {
    
 
       street: string;
       city: string;
       state: string;
       zip: any;
   
  }
  
export class Survey {
   
  constructor(
    public id?: number,
    public fname?: string,
    public lname?: string,
    public address: Address=new Address(),
    public telephone?: string,
    public email?: string,
    public surveydate?: any,
    public referral?: string,
    public satisfaction?: string,
    public qualities: string[]=[]
    ){}
  }

  export class Address {
    
    constructor(
      public street: string="",
      public city: string="",
      public state: string="",
      public zip: number=12345
    ){}
  }
  
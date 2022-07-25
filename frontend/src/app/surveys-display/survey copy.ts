export class Survey {
  constructor(
    public id: number=99,
    public fname: string="",
    public lname: string="",
    public address: Address=new Address(),
    public telephone: string="xxx-xxx-xxx",
    public email: string="survey@email.com",
    public surveydate: any=new Date().getDate(),
    public referral: string="",
    public satisfaction: string="",
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
  
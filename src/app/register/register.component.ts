import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private http: HttpClient) { }

  register(submittedData){
    alert('Parameter recieved : '+submittedData.name);
    
    this.http.post("test/rest/myresource/register1",{
      id: submittedData.id,
      name: submittedData.name,
    })
      .subscribe(
        (res: any) => {
          console.log(res);
        },
        err => {
          console.log("Error occured");
        }
      ); 
  }
  ngOnInit() {
  }
}

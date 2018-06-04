import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private http:HttpClient) { }

    onClick(data){
      alert(data.user_id);

    this.http.post('test/rest/myresource/register1',{
      user_id : data.user_id,
      password : data.password
      }
    ).subscribe(
    (res: any) =>{
      console.log(res);
      alert("Hi! :)");
    },
      err=>{
        console.log(err);
        alert("Bye :(");
      }
      );
     }

  ngOnInit() {
  }
}

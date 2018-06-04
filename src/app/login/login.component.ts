import {HttpClient} from '@angular/common/http';
import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private http: HttpClient) {}
  onclick(data) {
    alert(data.user_id);
    this.http.post("test/rest/myresource/register1", {
      user_id: data.user_id,
      password: data.password,
    }, {responseType: 'text'})
      .subscribe(
      (res: any) => {
        console.log(res);
        alert("Hi! :)");
      },
      err => {
        console.log(err);
        alert("Bye :(");
      }
      );
  }
  /* onClick(data){
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
    } */

  ngOnInit() {
  }
}

import {HttpClient} from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-angular',
  templateUrl: './angular.component.html',
  styleUrls: ['./angular.component.css']
})
export class AngularComponent implements OnInit {
 angular;
  constructor(private http : HttpClient) { }

  ngOnInit() {
  }
onClick(){
  alert(this.angular);
  this.http.get("test/rest/myresource/projectdetails").subscribe(res => this.angular = res);
  console.log(this.angular);
  }
}

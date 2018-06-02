import {HttpClient} from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-java',
  templateUrl: './java.component.html',
  styleUrls: ['./java.component.css']
})
export class JavaComponent implements OnInit { 
java;
  constructor(private http : HttpClient) { }

  ngOnInit() {
  }
onClick(){
  alert(this.java);
  this.http.get('test/rest/myresource/projectdetails').subscribe(res => this.java = res);
  console.log(this.java);
  }
}

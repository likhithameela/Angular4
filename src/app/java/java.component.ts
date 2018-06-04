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
    this.http.get('test/rest/myresource/javadetails').subscribe(res => this.java = res);
  console.log(this.java);

  }
onClick() {
   //alert(this.java);
    }
}

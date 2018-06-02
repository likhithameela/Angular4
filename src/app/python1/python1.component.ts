import {HttpClient} from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-python1',
  templateUrl: './python1.component.html',
  styleUrls: ['./python1.component.css']
})
export class Python1Component implements OnInit {
python1;
  constructor(private http : HttpClient) { }

  ngOnInit() {
  }
onClick(){
  alert(this.python1);
  this.http.get("test/rest/myresource/projectdetails").subscribe(res => this.python1 = res);
  console.log(this.python1);
  }
}

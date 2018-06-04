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
     this.http.get("test/rest/myresource/pythondetails").subscribe(res => this.python1 = res);
  console.log(this.python1);
 
  }
onClick(){
 // alert(this.python1);
  }
}

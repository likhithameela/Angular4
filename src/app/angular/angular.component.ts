import {HttpClient} from '@angular/common/http';
import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-angular',
  templateUrl: './angular.component.html',
  styleUrls: ['./angular.component.css']
})
export class AngularComponent implements OnInit {
  angular;
  constructor(private http: HttpClient) {}

  onClick(data) {
    alert("Your Comment has been uploaded!");
    this.http.post("test/rest/myresource/discussion", {
      user_id: data.user_id,
      discussion: data.discussion,
      lang_name: data.lang_name
    }
      , {responseType: 'text'}
      
      ).subscribe(
      (res: any) => {
        console.log(res);
        //alert("hi");
      },
      err => {
        console.log(err);
        alert("byee");
      }
    );

  }
  ngOnInit() {
 this.http.get('test/rest/myresource/angulardetails').subscribe(res => this.angular = res);
  console.log(this.angular);

  }
}

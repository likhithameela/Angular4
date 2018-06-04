import {HttpClient} from '@angular/common/http';
import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-discussion',
  templateUrl: './discussion.component.html',
  styleUrls: ['./discussion.component.css']
})
export class DiscussionComponent implements OnInit {
  discussion;
  constructor(private http: HttpClient) {}
  
  onClick(data) {
    alert("hi")
    alert(data.user_id);

    this.http.post('test/rest/myresource/discussion', {
      user_id: data.user_id,
      discussion: data.discussion
    }
    ).subscribe(
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

  ngOnInit() {
    this.http.get("test/rest/myresource/discussionforum").subscribe(res => this.discussion = res);
  console.log(this.discussion);
  }

}

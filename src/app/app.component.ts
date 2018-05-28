import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
  <h1>Angular Router</h1>
  <nav>
    <a routerLink="/home" routerLinkActive="active">Home</a>
    <a routerLink="/login" routerLinkActive="active">Login</a>
  </nav>
  <router-outlet></router-outlet>
`,
  
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
}
 
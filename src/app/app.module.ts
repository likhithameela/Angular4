import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpModule} from '@angular/http';
import {HttpClient} from '@angular/common/http';
import {HttpClientModule} from '@angular/common/http';
import {ApplicableRefactorInfo} from 'typescript';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import {LoginComponent} from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { JavaComponent } from './java/java.component';
import { Python1Component } from './python1/python1.component';
import { AngularComponent } from './angular/angular.component';
import { DiscussionComponent } from './discussion/discussion.component';


const appRoutes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: '', component: HomeComponent },
  { path: 'home', component: HomeComponent },
  { path: 'register/login', component: LoginComponent },
  { path: 'login/register', component: RegisterComponent },
  { path: 'java', component: JavaComponent },
  { path: 'python1', component: Python1Component },
  { path: 'angular', component: AngularComponent },
  { path: 'discussion', component: DiscussionComponent },
  ];

@NgModule({
    declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    HeaderComponent,
    JavaComponent,
    Python1Component,
    AngularComponent,
    DiscussionComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(
      appRoutes,
      {enableTracing: true}
      )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

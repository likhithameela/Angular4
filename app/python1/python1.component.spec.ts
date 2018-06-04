import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Python1Component } from './python1.component';

describe('Python1Component', () => {
  let component: Python1Component;
  let fixture: ComponentFixture<Python1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Python1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Python1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

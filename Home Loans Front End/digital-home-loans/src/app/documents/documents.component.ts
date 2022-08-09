import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-documents',
  templateUrl: './documents.component.html',
  styleUrls: ['./documents.component.css']
})
export class DocumentsComponent implements OnInit {

  msg:string | any
  
  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  clickEvent(){
    this.msg='Successfully Submitted!';
    return this.msg;
  }
}

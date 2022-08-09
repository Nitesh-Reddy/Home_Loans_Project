import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

import { UserServiceService } from '../user-service.service';
import { User } from '../user';

@Component({
  selector: 'app-admin-homepage',
  templateUrl: './admin-homepage.component.html',
  styleUrls: ['./admin-homepage.component.css']
})
export class AdminHomepageComponent implements OnInit {

  users: any;
  constructor(
    private router:Router,
    private userservice:UserServiceService
    ) { }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData() {
    this.users = [];
    
    this.userservice.findallusers().subscribe(res=>{
      debugger
      this.users= res;
    });
  }
  
  userDocuments(id: number){
    this.router.navigate(['', id]);
  }

  deleteuser(id: any) {
    this.userservice.deleteuser(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  updateuser(id:any){
    this.userservice.updateuser(id).subscribe(r=>{
      
    });
    this.users = [];
    
    this.userservice.findallusers().subscribe(res=>{
      debugger
      this.users= res;
    });
  }
}

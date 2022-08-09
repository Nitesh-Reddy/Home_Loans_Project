import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  private baseUrl = 'http://localhost:8989/user/findAllUsers';
  private baseUrl1 = 'http://localhost:8989/user/register/delete';
  constructor(private http:HttpClient) { }

  findallusers() {
    return this.http.get(`http://localhost:8989/user/findAllUsers`)
  }
  deleteuser( id: any): Observable<any> {

    return this.http.delete(`${this.baseUrl1}/${id}`,{ responseType: 'text' });
  }

  updateuser(id:any) {

    return this.http.put(`http://localhost:8989/user/update?id=${id}&status=true`,{})
  }
  findByEmail(emailId:any) {
    return this.http.get(`http://localhost:8989/user/findByEmail/${emailId}`)
  
  }
}

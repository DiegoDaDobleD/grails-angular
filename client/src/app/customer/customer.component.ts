import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute, Router } from '@angular/router';
import {Globals} from '../globals'

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  customers: any;
  token: string;

  constructor(private router: Router, private route: ActivatedRoute, private http: HttpClient,
              private globals: Globals) {
    this.token = globals['token'];
    // console.info ('listado constructor: ' + globals['token']);
  }

  ngOnInit() {
    // console.info ('listado ngOnInit: ' + this.token);
    const headers = {'X-Auth-Token': this.token}
    this.http.get('http://localhost:8080/api/customer', { headers }).subscribe(data =>{
      this.customers = data;
    }, (err) => {
        console.log(err);
        if (typeof err.status === "number" && err.status == 401) {
          this.router.navigate(['/user-login/']);
        }
    });
  }

}

import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
// import {IndexComponent} from "./index/index.component";
import { CustomerComponent } from "./customer/customer.component";
import { CustomerCreateComponent } from "./customer-create/customer-create.component";
import { CustomerDetailComponent } from './customer-detail/customer-detail.component';
import { CustomerEditComponent } from "./customer-edit/customer-edit.component";
import { UserLoginComponent } from "./user-login/user-login.component";

const routes: Routes = [
	{
		path: 'customers',
		component: CustomerComponent,
		data: { title: 'Customer List' }
	},
	{
		path: '',
		redirectTo: '/user-login',
		pathMatch: 'full'
	},
	{
	  path: 'customer-create',
	  component: CustomerCreateComponent,
	  data: { title: 'Add Customer' }
	},
	{
	  path: 'customer-details/:id',
	  component: CustomerDetailComponent,
	  data: { title: 'Customer Details' }
	},
	{
	  path: 'customer-edit/:id',
	  component: CustomerEditComponent,
	  data: { title: 'Edit Customer' }
	},
  {
    path: 'user-login',
    component: UserLoginComponent,
    data: { title: 'User Login' }
  },
  {path: '', redirectTo: 'index', pathMatch: 'full'},
  {path: 'index', component: UserLoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

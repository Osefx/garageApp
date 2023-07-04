import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CarComponent } from './car/car.component';
import { CarEditComponent } from './car-edit/car-edit.component';
import { CarCreateComponent } from './car-create/car-create.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  { path: 'cars', component: CarComponent },
  { path: 'cars/:id/edit', component: CarEditComponent },
  { path: 'cars/:id/delete', component: CarComponent },
  { path: 'cars/newCar', component: CarCreateComponent },
  { path: 'login', component: LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

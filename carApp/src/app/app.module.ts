import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CarComponent } from './car/car.component';
import { CarEditComponent } from './car-edit/car-edit.component';
import { FormsModule } from '@angular/forms';
import { CarCreateComponent } from './car-create/car-create.component';

const appRoutes: Routes = [
  { path: 'cars', component: CarComponent },
  { path: 'cars/:id/edit', component: CarEditComponent },
  // Add more routes here if needed
];

@NgModule({
  declarations: [
    AppComponent,
    CarComponent,
    CarEditComponent,
    CarCreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {

}

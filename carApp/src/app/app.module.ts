import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HTTP_INTERCEPTORS, HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CarComponent } from './car/car.component';
import { CarEditComponent } from './car-edit/car-edit.component';
import { FormsModule } from '@angular/forms';
import { CarCreateComponent } from './car-create/car-create.component';
import { LoginComponent } from './login/login.component';
import { CustomInterceptor } from './service/customInterceptor';

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
    CarCreateComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
    FormsModule
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: CustomInterceptor,
      multi: true,
    },
  ],
  bootstrap: [AppComponent]
})
export class AppModule {

}

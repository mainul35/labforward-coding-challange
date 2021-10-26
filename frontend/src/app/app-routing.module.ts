import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ResearchComponent} from "./components/research/research.component";
import {NotFoundComponent} from "./components/not-found/not-found.component";

const routes: Routes = [
  {path: '', component: ResearchComponent},
  {path: 'frequency', component: ResearchComponent},
  {path: '**', component: NotFoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

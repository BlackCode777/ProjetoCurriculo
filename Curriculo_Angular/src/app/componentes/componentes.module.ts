import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { CadastroUserComponent } from './usuario/cadastro-user/cadastro-user.component';
import { ListagemUserComponent } from './usuario/listagem-user/listagem-user.component';


@NgModule({
  declarations: [  
    CadastroUserComponent, ListagemUserComponent
  ],
  imports: [
    HttpClientModule,
    CommonModule
  ]
})
export class ComponentesModule { }

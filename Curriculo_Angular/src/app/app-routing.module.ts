import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  // Rota principal em caso de erro
  //{ path: '**', redirectTo: '', pathMatch: 'full' },
  // Rota de home
  //{ path: '', loadChildren: () => import('./home/home.module').then(m => m.HomeModule) },
  // Rota de usuarios para cadastro
  //
  // Rota de usuarios
  {
    path: 'CadastroUserComponent',
    loadChildren: () =>
      import('./componentes/componentes.module').then(
        (m) => m.ComponentesModule
      ),
  },

  // Rota de usuarios para listagem
  {
    path: 'ListagemUserComponent',
    loadChildren: () =>
      import('./componentes/componentes.module').then(
        (m) => m.ComponentesModule
      ),
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

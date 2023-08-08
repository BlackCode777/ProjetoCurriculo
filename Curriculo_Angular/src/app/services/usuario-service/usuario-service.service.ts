import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UsuarioInterModel } from '../../model/usuario-inter-model';

/* ATENÇÃO: Toda a regra de negócios ficará aqui dentro */

@Injectable({
  providedIn: 'root',
})
export class UsuarioServiceService {
  
  // tipando com model UsuarioInterModel
  //public usuario: UsuarioInterModel = new UsuarioInterModel();

  private url = 'http://localhost:8080';
  private usuario: UsuarioInterModel = new UsuarioInterModel();

  constructor(private http: HttpClient) {}

  // Método Put para atualizar um usuário por id
  public atualizarUsuario(id: UsuarioInterModel): Observable<UsuarioInterModel> {
    return this.http.put<UsuarioInterModel>(`${this.url}` + this.usuario, id);
  }

  // Salvando um usuário no banco de dados usando this.usuario
  public salvarUsuario(usuario: UsuarioInterModel): Observable<UsuarioInterModel> {
    return this.http.post<UsuarioInterModel>(
      `${this.url}` + this.usuario,
      usuario
    );
  }

  // Pesquisando todos os usuários
  public getAllUsuarios(): Observable<UsuarioInterModel[]> {
    return this.http
      .get<UsuarioInterModel[]>(`${this.url}` + this.usuario)
      .pipe(
        (response) => response,
        (error) => error
      );
  }
}

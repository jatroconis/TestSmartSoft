import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class ProductService {

  save( params: any ) {
    return this.http.post( 'http://localhost:8080/factura', params)
  }

  saveUser( params: any){
    return this.http.post ('http://localhost:8080/cliente', params)
  }

  constructor(private http: HttpClient) { }
}

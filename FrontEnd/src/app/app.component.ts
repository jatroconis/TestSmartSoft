import { Component } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { ProductService } from './services/product.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  products: any[] = [];
  constructor(private product: ProductService) {}

  clientes: any[] = [];
  opcCliente: Number = 0;
  
  clienteForm = new FormGroup({
    nombre: new FormControl(''),
    apellido: new FormControl(''),
    direccion: new FormControl(''),
    fechaNacimiento: new FormControl(''),
    telefono: new FormControl(''),
    email: new FormControl(''),
  })


  facturaForm = new FormGroup({
    fecha: new FormControl(''),
  })

  detalleForm = new FormGroup({
    cantidad: new FormControl(''),
    precio: new FormControl(''),
  })

  productoForm = new FormGroup({
    nombre: new FormControl(''),
    precio: new FormControl(''),
    stock: new FormControl('')
  })

  showDataCliente() {
    const data = {
      nombre: this.clienteForm.get('nombre')?.value,
      apellido: this.clienteForm.get('apellido')?.value,
      direccion : this.clienteForm.get('direccion')?.value,
      fechaNacimiento : this.clienteForm.get('fechaNacimiento')?.value,
      telefono : this.clienteForm.get('telefono')?.value,
      email : this.clienteForm.get('email')?.value
    }

    this.product.saveUser(data).subscribe( data => {
      this.clientes.push(data)
     /// console.log(data);
    });
  }

  showDataFactura() {
    const data = {
      factura: {
        fecha: this.facturaForm.get('fecha')?.value,
      },
      idCliente : this.opcCliente,
      producto : {
        nombre: this.productoForm.get('nombre')?.value,
        precio: this.productoForm.get('precio')?.value,
        stock: this.productoForm.get('stock')?.value,
      },
      detalle : {
        cantidad: this.detalleForm.get('cantidad')?.value,
        precio: this.detalleForm.get('precio')?.value
      }     
    }
    console.log(data);
    this.product.save(data).subscribe( data => {
     // console.log(data);
    });


  }



  myFunction(event:any) {
    console.log(event.target.value);
    this.opcCliente = event.target.value
  }





}

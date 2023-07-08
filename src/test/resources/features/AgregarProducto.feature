 #language: es
   Característica: Agregar producto al carro de compras
     Como usuario ingreso a la pagina de falabella
     Quiero agregar un producto y agregar cantidad necesaria
     Para agregar al carrito de compras

   Escenario: Agregar producto al carro de compras exitosamente
     Dado el usuario ingresa a la pagina de falabella
     Cuando busca y selecciona un producto y cantidad de su preferencia
     Entonces agrega el producto al carro de compras valida el nombre y la cantidad seleccionada

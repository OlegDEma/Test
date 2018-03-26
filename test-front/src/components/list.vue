<template>
  <div>
      <div class="wrapper">
  <div class="col">
    <h1>Search results: Total:</h1>
  </div>
  <div class="col buttons">
    <a><img class="image" src="../assets/Undo_Arrow-256.png" alt="">Undo</a>
    <a><img class="image" src="../assets/Cancel-256.png" alt="">Clead All</a>
  </div>
</div>
    <table class="first-table">
  
  <tr>
    <th>Rate</th>
    <th>F</th>
    <th>Source</th>
    <th>Age</th>
    <th>Avail</th>
    <th>Truck</th>
    <th>Truck-O</th>
    <th>DH-O</th>
    <th>F/P</th>
    <th>Origin</th>
    <th>Trip</th>
    <th>Destination</th>
    <th>DH-D</th>
    <th>Truck-D</th>
    <th>Length</th>
    <th>Weight</th>
    <th>Company</th>
    <th>Phone</th>
  </tr>  
  <tr v-for="truck in trucks" :key="truck.id">
    <td>{{truck.rate}}</td>
    <td>{{truck.f}}</td>
    <td>{{truck.source}}</td>
    <td>{{truck.age}}</td>
    <td>{{truck.avail}}</td>
    <td>{{truck.truck}}</td>
    <td>{{truck.truckO}}</td>
    <td>{{truck.dhO}}</td>
    <td>{{truck.fp}}</td>
    <td>{{truck.origin}}</td>
    <td>{{truck.trip}}</td>
    <td>{{truck.destination}}</td>
    <td>{{truck.dhD}}</td>
    <td>{{truck.truckO}}</td>
    <td>{{truck.length}}</td>
    <td>{{truck.weight}}</td>
    <td>{{truck.company}}</td>
    <td>{{truck.phone}}</td>
  </tr> 
</table>
  </div>
</template>

<script>
   export default {
  name: 'list',
  data:function(){
    return{
      title:'Post Trucks',
      trucks:[],
      url:'http://localhost:8080/trucks',

    }
  },
  methods:{
    getTrucks:function(){

        this.$http.get(this.url,this.options).then(function(responce){
              this.trucks = responce.body
          },function(error){
              console.log(error)
          })
    },
    load:function(){
        this.getTrucks()
    }
  },
  created:function(){

  }
}
</script>

<style>

</style>

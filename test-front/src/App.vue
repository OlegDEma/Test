<template>
  <div id="app">
    <div>
      <h1 id="title">{{title}}</h1>
      <ul class="menu">
        <li><a href="#" @click="load"><img class="image" src="./assets/green-play-button-icon-24504.png"  alt=""></a></li>
        <li><img class="image" src="./assets/Pluspunt.png" alt=""> New</li>
        <li><img class="image" src="./assets/600px-Road-sign-no-entry.svg.png" alt="">Delete All</li>
        <li><img class="image" src="./assets/41e4acbe07fcf661b46594c978c1ff01-reload-arrow-icon.png" alt="">Repost All</li>
      </ul>
    </div>
    <table class="first-table">
  
  <tr>
    <th>Call Controll</th>
    <th>Read</th>
    <th>Sound/Auto Call</th>
    <th>Truck</th>
    <th>Origin</th>
    <th>Destination</th>
    <th>Pickup</th>
    <th>DH-O</th>
    <th>DH-D</th>
    <th>F/P</th>
    <th>Length</th>
    <th>Weight</th>
    <th>Trip</th>
    <th>Alarm</th>
    <th>Actions</th>
  </tr>  
</table>
    <router-view ref="child"/>
  </div>
</template>

<script>
export default {
  name: 'App',
  data:function(){
    return{
      title:'Post Trucks'
    }
  },
  methods:{
    load:function(){
      this.$refs.child.load()
    }
  }
 
}
</script>

<style>
body{
  background-color: rgb(177, 230, 255);
}
.menu li{
  display: inline-block;
  font-size: 2em;
  margin: 10px 20px;
  vertical-align: middle;
  
}
.image{
  vertical-align: middle;
  width: 30px;
  height: 30px;
  margin-right: 5px;
}
.first-table{
  width: 100%;
}

.first-table th{
  background-color: rgb(70, 70, 70);
  color: white;
  padding-bottom: 10px;
  padding-top: 10px;
  text-align: center;
  border: 1px solid black;
  
}
.first-table td{
  background-color: rgb(255, 255, 255);
  color: black;
  padding-bottom: 10px;
  padding-top: 10px;
  text-align: center;
  border: 1px solid black;
}
.first-table tr{
  border: 1px solid black;
}
.undo{
  display: block;
  width: 200px;
  position: relative;
  float: right;
}

.undo li{
  display: inline-block;
}


.col{
  width: 50%;
  float: left;
}

.wrapper{
  clear: both;
}
.buttons{
  height: 50px;
  text-align: right;
  padding-top: 16px;
}
.buttons a{
  font-size: 30px;
}



</style>

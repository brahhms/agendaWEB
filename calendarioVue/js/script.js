
const app = new Vue({

    el: '#app',
    data: {//arreglar despues
        usuario:'brhhms',
        //fin arreglar despues
        url:"http://localhost:8080/calendario/api/",
        daysNames:["Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"],
        months:  ["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"],
        monthIndex: null,
        year:null,
        selectedDate:null,
        calendars:null,
        events:null,
        newEvent:null

    },
    created(){
        this.build();
        
    },
    methods:{
        build(){
            let currentDate =new Date();
            this.monthIndex = currentDate.getMonth();
            this.year = currentDate.getFullYear();
            this.fetchEvents();
            this.fetchCalendars();
        },
        nextMonth(){
            this.monthIndex++;
        },
        prevMonth(){
            this.monthIndex--;
        },
        selectDate(d){
            this.selectedDate = d;
            console.log(this.selectedDate);
        },
        fetchEvents(){
            month = this.monthIndex + 1;
            fetch(this.url+"evento/byDate/"+this.year+"/"+month)
            .then(response => response.json() )
            .then(result => {this.events = result})
            .catch(error => console.log('error', error));      
        },
        fetchCalendars(){
            fetch(this.url+"calendario/")
            .then(response => response.json() )
            .then(result => {this.calendars = result})
            .catch(error => console.log('error', error));      
        }
    },
    computed:{
        monthName(){
            this.fetchEvents();
            return this.months[this.monthIndex];
        },
        calendar(){
            if (this.events != null) {
                let dias = new Month(this.monthIndex,this.year).getDaysArray();
        
                let filas = new Array();
                for (let r = 0; r < 5; r++) {
                    let cols = new Array();
                    for(let c=1; c<=7; c++){
                        let activities = new Array();
                        let x = dias.shift();
                        this.events.forEach(element => {
                            if (element.dia === x) {
                                let cadena = element.nombre;
                                
                                if (cadena.length>19) {
                                    cadena = element.nombre.slice(0,17)+"...";
                                } 
                                activities.push({nombre:cadena,color:element.calendarioIdcalendario.color});
                            }
                        });
                        cols.push(new Card(x,activities));
                    };
                    filas.push(cols);
                }
                return filas;
            }             
        }
    }

});


function Card(date,activities){
    this.date = date;
    this.activities = activities;
}

function Month( month , year) {
    this.month = month ;
    this.year = year ;
    //Date(yyyy,mm).getDay devuelve el indice del primer dia para el mes indicado.
    //nota: al indicar la fecha por parametros el primer mes corresponde a 0
    this.firstDay = new Date(year,month).getDay();
    
    month=month+2
    //Date("yyyy-mm").getDate devuelve la fecha del ultimo dia para el mes anterior al indicado, lo que corresponde a la duracion del mes anterior al indicado.
    //nota: al indicar la fecha como string el primer mes corresponde a 1
    this.lastDay = new Date(year+"-"+month).getDate();
    this.getDaysArray = function(){
        let days = new Array();

        for (let i = 0; i < this.firstDay; i++) {
            days.unshift(undefined);
        }

        for (let day = 1; day <= this.lastDay; day++) {
            days.push(day);
        }
        return days;
    };
}
















function consumir(){

    var myHeaders = new Headers();


var requestOptions = {
  method: 'GET',
  headers: myHeaders,
  redirect: 'follow'
};

fetch("http://localhost:8080/calendario/api/evento/1/2020/3", requestOptions)
  .then(response => response.json())
  //.then(result => console.log(result))
  .catch(error => console.log('error', error));

}
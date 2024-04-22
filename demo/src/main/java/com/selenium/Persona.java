package com.selenium;
import java.util.ArrayList;
import java.util.Random;

public class Persona {
    private String solicitante;
    private String entidad;
    private String contacto;
    private String email;
    private String telefono;
    private String medios;
    private String espacio;
    private String descripcion;
    private String destinatarios;
    private String asistentes;
    private String fecha;
    private String horario;

    public Persona() {
        this.solicitante = construirNombre();
        this.entidad = construirentidad();
        this.contacto = this.solicitante;
        this.email = construirEmail(this.solicitante);
        this.telefono = construirTelefono();
        this.medios = construirMedios();
        this.espacio = construirEspacio();
        this.descripcion = construirDescripcion();
        this.destinatarios = this.solicitante;
        this.asistentes = construirAsistentes();
        this.fecha = construirFecha();
        this.horario = construirHorario();
    }
    public String getSolicitante() {
        return solicitante;
    }
    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }
    public String getEntidad() {
        return entidad;
    }
    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }
    public String getContacto() {
        return contacto;
    }
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getMedios() {
        return medios;
    }
    public void setMedios(String medios) {
        this.medios = medios;
    }
    public String getEspacio() {
        return espacio;
    }
    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDestinatarios() {
        return destinatarios;
    }
    public void setDestinatarios(String destinatarios) {
        this.destinatarios = destinatarios;
    }
    public String getAsistentes() {
        return asistentes;
    }
    public void setAsistentes(String asistentes) {
        this.asistentes = asistentes;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String construirHorario(){
        Random random = new Random(); 
        int aleatorio = random.nextInt(10)+9;
        Random random2 = new Random();
        int aleatorio2 = random2.nextInt(4);
        if (aleatorio2 == 0){
            aleatorio2 = 0;
        }
        else if (aleatorio2 == 1){
            aleatorio2 = 15;
        }
        else if (aleatorio2 == 2){
            aleatorio2 = 30;
        }
        else if (aleatorio2 == 3){
            aleatorio2 = 45;
        }

        return ""+aleatorio+":"+aleatorio2;
    }
    public String construirFecha(){
        String fecha = "";
        Random random = new Random(); 
        int aleatorio = random.nextInt(5)+22;
        fecha = aleatorio+"/04/2024";
        return fecha;
    }

    public String construirAsistentes(){
        Random random = new Random(); 
        int aleatorio = random.nextInt(5)+1;
        return String.valueOf(aleatorio);
    }
    public String construirDescripcion(){
        ArrayList<String> descripciones = new ArrayList<>();
        descripciones.add("necesito acceder a ");
        descripciones.add("Quiero usar ");
        descripciones.add("me gustaría reservar ");
        descripciones.add("visita escolar ");
        descripciones.add("visitar la biblioteca ");
        descripciones.add("consultar dudas inscripcion ");
        descripciones.add("película");
        descripciones.add("Concierto");
        descripciones.add("Club de lectura");
        descripciones.add("Presentacion literaria ");
        Random random = new Random(); 
        int aleatorio = random.nextInt(10);
        return descripciones.get(aleatorio);
    }
    public String construirEspacio(){
        ArrayList<String> espacios = new ArrayList<>();
        espacios.add("Salón de actos");
        espacios.add("Sótano");
        espacios.add("Cabina");
        espacios.add("Lucernario");
        Random random = new Random(); 
        int aleatorio = random.nextInt(4);
        return ""+espacios.get(aleatorio);
    }
    public String construirMedios(){
        ArrayList <String> medios = new ArrayList<>();
        medios.add("Ordenador");
        medios.add("Impresora");
        medios.add("Escáner");
        medios.add("Fotocopiadora");
        medios.add("Proyector");
        medios.add("Pantalla de proyección");
        medios.add("Sistema de sonido");
        medios.add("Auriculares");
        medios.add("Tableta");
        medios.add("Teléfono");
        medios.add("Cámara digital");
        medios.add("Grabadora de voz");
        medios.add("Lector de tarjetas");
        medios.add("Disco duro externo");
        medios.add("Router de red");
        medios.add("Pizarra interactiva");
        medios.add("Lápiz óptico");
        medios.add("Software de gestión bibliotecaria");
        medios.add("Sistema de seguridad");
        medios.add("Etiquetadora");
        medios.add("Máquina de encuadernación");
        medios.add("Caja registradora");
        medios.add("Carrito de libros");
        medios.add("Estanterías");
        medios.add("Sillas y mesas");
        medios.add("Cajas de almacenamiento");
        medios.add("Cajas de seguridad");
        medios.add("Cerraduras electrónicas");
        medios.add("Sistema de control de acceso");
        medios.add("Sistema de climatización");
        Random random = new Random(); 
            int aleatorio = random.nextInt(20);
        return ""+medios.get(aleatorio);
    }
    public String construirTelefono(){
        String telefono = "6";
        for (int i = 0; i<8; i++){
            Random random = new Random(); 
            int aleatorio = random.nextInt(10);
            telefono = telefono + aleatorio;
        }
        return telefono;
    }

    public String construirEmail(String nombrecomplet){
        String correo = "";
        ArrayList<String> dominios = new ArrayList<>();
        Random random = new Random();
        int aleatorio1 = random.nextInt(15);
        for (int i = 0; i< aleatorio1; i++){
        for (int j = 0; j < nombrecomplet.length()-1; i++){
            correo = correo + nombrecomplet.charAt(j);
        }
        }
        Random random2 = new Random();
        int aleatorio2 = random2.nextInt(20);
        dominios.add("@gmail.com");
        dominios.add("@hotmail.com");
        dominios.add("@yahoo.com");
        dominios.add("@outlook.com");
        dominios.add("@aol.com");
        dominios.add("@icloud.com");
        dominios.add("@protonmail.com");
        dominios.add("@zoho.com");
        dominios.add("@mail.com");
        dominios.add("@gmx.com");
        dominios.add("@yandex.com");
        dominios.add("@live.com");
        dominios.add("@me.com");
        dominios.add("@fastmail.com");
        dominios.add("@inbox.com");
        dominios.add("@tutanota.com");
        dominios.add("@mail.ru");
        dominios.add("@rocketmail.com");
        dominios.add("@rediffmail.com");
        dominios.add("@cox.net");
        correo = correo + dominios.get(random2.nextInt(aleatorio2));
        return correo;
    }

    public String construirentidad(){
        ArrayList<String> entidad = new ArrayList<String>();
        
entidad.add("Acme Corporation");
entidad.add(""+this.solicitante);
entidad.add("GlobalTech Solutions");
entidad.add(""+this.solicitante);
entidad.add("InnovaTech Industries");
entidad.add(""+this.solicitante);
entidad.add("Apex Innovations");
entidad.add(""+this.solicitante);
entidad.add("Nexus Systems");
entidad.add(""+this.solicitante);
entidad.add("TechGenius");
entidad.add("FutureTech Enterprises");
entidad.add(""+this.solicitante);
entidad.add("Quantum Solutions");
entidad.add("Spectrum Technologies");
entidad.add(""+this.solicitante);
entidad.add("PrimeData Solutions");
entidad.add("EagleEye Analytics");
entidad.add(""+this.solicitante);
entidad.add("VitaHealth Labs");
entidad.add(""+this.solicitante);
entidad.add("AstraGen Pharmaceuticals");
entidad.add(""+this.solicitante);
entidad.add("Sunrise Energy");
entidad.add(""+this.solicitante);
entidad.add("Solaris Power");
entidad.add(""+this.solicitante);
entidad.add("GreenTech Innovations");
entidad.add("BrightStar Communications");
entidad.add(""+this.solicitante);
entidad.add("CyberShield Security");
entidad.add(""+this.solicitante);
entidad.add("DataGuard Systems");
entidad.add(""+this.solicitante);
entidad.add("AlphaTech Robotics");
entidad.add(""+this.solicitante);
entidad.add("MegaByte Software");
entidad.add(""+this.solicitante);
entidad.add("GoldenGate Construction");
entidad.add(""+this.solicitante);
entidad.add("SilverLine Architects");
entidad.add(""+this.solicitante);
entidad.add("BluePrint Engineering");
entidad.add(""+this.solicitante);
entidad.add("StarShip Logistics");
entidad.add(""+this.solicitante);
entidad.add("SwiftCourier Services");
entidad.add(""+this.solicitante);
entidad.add("GlobeTrek Travel Agency");
entidad.add("AdventureQuest Expeditions");
entidad.add("Nature's Haven Retreat");
entidad.add("Wellness Oasis Spa");
entidad.add("FitFlex Fitness Center");
entidad.add("MindBody Wellness");
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add("FoodFusion Catering");
entidad.add("TasteBuds Restaurants");
entidad.add("Gourmet Delights");
entidad.add("FashionFusion Apparel");
entidad.add("StyleSense Boutique");
entidad.add("ChicCouture Fashion House");
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);

entidad.add("ArtisticExpressions Gallery");
entidad.add("MusicMasters Entertainment");
entidad.add("DanceRhythm Studios");
entidad.add("FilmFusion Productions");
entidad.add("SportsZone Arena");
entidad.add("FitZone Gym");
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add("HappyTails Pet Services");
entidad.add("Pawsome Pet Care");
entidad.add("VetCare Clinics");
entidad.add("HomeSweetHome Real Estate");
entidad.add("DreamBuilders Construction");
entidad.add("Interiors by Design");
entidad.add("GardenScape Landscaping");
entidad.add("CleanSweep Cleaning Services");
entidad.add("TechRepair Solutions");
entidad.add("AutoPro Mechanics");
entidad.add("SpeedyWheels Auto Shop");
entidad.add("Starshine Events");
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);


entidad.add("CelebrationNation Party Planners");
entidad.add("DreamWeddings Planning");
entidad.add("CaptureMemories Photography");
entidad.add("TrendyTots Children's Boutique");
entidad.add("ToyLand Fun Zone");
entidad.add("Bookworms Bookstore");
entidad.add("ArtCraft Supplies");
entidad.add("HomeZone Furniture");
entidad.add("GiftsGalore");
entidad.add("JewelCraft Jewelry");
entidad.add("TechZone Electronics");
entidad.add("BeautyBliss Salon");
entidad.add("GlamourGlow Spa");
entidad.add("FitnessFuel Supplements");
entidad.add("FreshBites Grocery Store");
entidad.add("BakeHouse Bakery");
entidad.add("CoffeeBean Cafe");
entidad.add("YummyTreats Ice Cream");
entidad.add("Sip&Savor Wine Bar");
entidad.add("ExquisiteEvents Catering");
entidad.add("MusicMakers DJ Services");
entidad.add("DanceFever Academy");
entidad.add("StarStruck Talent Agency");
entidad.add("VogueModels Management");
entidad.add("SportsPro Athlete Management");
entidad.add("WellnessFirst Healthcare");
entidad.add("EliteDental Care");
entidad.add("EcoClean Dry Cleaners");
entidad.add("GadgetGurus Electronics Repair");
entidad.add("FashionFlair Boutique");
entidad.add("HomeDecor Haven");
entidad.add("PetParadise Boarding");
entidad.add("DreamHomes Real Estate");
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
entidad.add(""+this.solicitante);
Random random1 = new Random();
int aleatorio1 = random1.nextInt(120);
return entidad.get(aleatorio1);

    }
    public String construirNombre(){
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<String> apellidos = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Laura");
        nombres.add("Luis");
        nombres.add("Andrea");
        nombres.add("Alejandro");
        nombres.add("Sofía");
        nombres.add("Manuel");
        nombres.add("Gabriela");
        nombres.add("José");
        nombres.add("Natalia");
        nombres.add("Miguel");
        nombres.add("Valentina");
        nombres.add("David");
        nombres.add("Carolina");
        nombres.add("Francisco");
        nombres.add("Isabella");
        nombres.add("Lucía");
        nombres.add("Fernando");
        nombres.add("Gabriel");
        nombres.add("Valeria");
        nombres.add("Ricardo");
        nombres.add("Camila");
        nombres.add("Diego");
        nombres.add("Paula");
        nombres.add("Sebastián");
        nombres.add("Daniela");
        nombres.add("Hugo");
        nombres.add("Catalina");
        nombres.add("Javier");
        nombres.add("Marina");
        nombres.add("Óscar");
        nombres.add("Martina");
        nombres.add("Andrés");
        nombres.add("Renata");
        nombres.add("Jorge");
        nombres.add("Mariana");
        nombres.add("Emilia");
        nombres.add("Gustavo");
        nombres.add("Renzo");
        nombres.add("Melanie");
        nombres.add("Benjamín");
        nombres.add("Luciana");
        nombres.add("Oliver");
        nombres.add("Victoria");
        nombres.add("Alex");
        nombres.add("Daniella");
        nombres.add("Matías");
        nombres.add("Carmen");
        nombres.add("Rodolfo");
        nombres.add("Paulina");
        nombres.add("Santiago");
        nombres.add("Valeria");
        nombres.add("Adrián");
        nombres.add("Alexa");
        nombres.add("Raúl");
        nombres.add("Isidora");
        nombres.add("Simón");
        nombres.add("Antonella");
        nombres.add("Felipe");
        nombres.add("Valentina");
        nombres.add("Eduardo");
        nombres.add("Florencia");
        nombres.add("Julio");
        nombres.add("Celeste");
        nombres.add("Ignacio");
        nombres.add("María José");
        nombres.add("Leonardo");
        nombres.add("Montserrat");
        nombres.add("Hernán");
        nombres.add("Abril");
        nombres.add("Roberto");
        nombres.add("Romina");
        nombres.add("Mauricio");
        nombres.add("Agustina");
        nombres.add("Marco");
        nombres.add("Antonia");
        nombres.add("Joaquín");
        nombres.add("Isabel");
        nombres.add("Óscar");
        nombres.add("Samantha");
        nombres.add("Julián");
        nombres.add("Mariana");
        nombres.add("Héctor");
        nombres.add("Gabriela");
        nombres.add("Alberto");
        nombres.add("Carolina");
        nombres.add("Feliciano");
        nombres.add("Constanza");
        nombres.add("Marcos");
        nombres.add("Valeria");
        nombres.add("Claudio");
        nombres.add("María Fernanda");
        nombres.add("Iván");
        nombres.add("Francisca");
        nombres.add("Fabián");
        nombres.add("Daniela");
        nombres.add("Raimundo");
        nombres.add("Alejandra");
        nombres.add("Salvador");
        nombres.add("Ángela");
        nombres.add("Josué");
        nombres.add("Pamela");
        nombres.add("Israel");
        nombres.add("Javiera");
        nombres.add("Óscar");
        nombres.add("Lorena");
        nombres.add("Esteban");
        nombres.add("Yasmin");
        nombres.add("Eugenio");
        nombres.add("Camila");

        apellidos.add("González");
        apellidos.add("Rodríguez");
        apellidos.add("García");
        apellidos.add("López");
        apellidos.add("Martínez");
        apellidos.add("Pérez");
        apellidos.add("Sánchez");
        apellidos.add("Romero");
        apellidos.add("Torres");
        apellidos.add("Flores");
        apellidos.add("Gómez");
        apellidos.add("Díaz");
        apellidos.add("Vargas");
        apellidos.add("Ramos");
        apellidos.add("Morales");
        apellidos.add("Ramírez");
        apellidos.add("Herrera");
        apellidos.add("Cruz");
        apellidos.add("Castro");
        apellidos.add("Méndez");
        apellidos.add("Morales");
        apellidos.add("Pacheco");
        apellidos.add("Silva");
        apellidos.add("Castillo");
        apellidos.add("Ortega");
        apellidos.add("Chávez");
        apellidos.add("Cortés");
        apellidos.add("Lara");
        apellidos.add("Soto");
        apellidos.add("Mendoza");
        apellidos.add("Carrillo");
        apellidos.add("Ríos");
        apellidos.add("Vega");
        apellidos.add("León");
        apellidos.add("Navarro");
        apellidos.add("Bautista");
        apellidos.add("Mejía");
        apellidos.add("Estrada");
        apellidos.add("Fuentes");
        apellidos.add("Castañeda");
        apellidos.add("Santos");
        apellidos.add("Cabrera");
        apellidos.add("Becerra");
        apellidos.add("Quintero");
        apellidos.add("Reyes");
        apellidos.add("Arango");
        apellidos.add("Zamudio");
        apellidos.add("Corona");
        apellidos.add("Delgado");
        apellidos.add("Roldán");
        apellidos.add("Valle");
        apellidos.add("Becerril");
        apellidos.add("Valdés");
        apellidos.add("Quintana");
        apellidos.add("Castañón");
        apellidos.add("Villalpando");
        apellidos.add("Vega");
        apellidos.add("Gallardo");
        apellidos.add("Mondragón");
        apellidos.add("Sanabria");
        apellidos.add("Orozco");
        apellidos.add("Ponce");
        apellidos.add("Cadena");
        apellidos.add("Montemayor");
        apellidos.add("Carrasco");
        apellidos.add("Bernal");
        apellidos.add("Salmerón");
        apellidos.add("Rendón");
        apellidos.add("Ortíz");
        apellidos.add("Ávalos");
        apellidos.add("Ríos");
        apellidos.add("Segovia");
        apellidos.add("Villanueva");
        apellidos.add("Méndez");
        apellidos.add("Zaragoza");
        apellidos.add("Cortés");
        apellidos.add("Vargas");
        apellidos.add("Navarro");
        apellidos.add("Duarte");
        apellidos.add("Olivares");
        apellidos.add("Hernández");
        apellidos.add("Canales");
        apellidos.add("Guzmán");
        apellidos.add("Herrero");
        apellidos.add("Villagómez");
        apellidos.add("Cruz");
        apellidos.add("Mora");
        apellidos.add("Villareal");
        apellidos.add("Cisneros");
        apellidos.add("Luna");
        apellidos.add("Escobar");
        apellidos.add("Lorenzo");
        apellidos.add("Villavicencio");
        apellidos.add("Carmona");
        apellidos.add("Guzmán");
        apellidos.add("Del Valle");
        apellidos.add("Villaseñor");
        apellidos.add("Bustos");
        apellidos.add("Mercado");
        apellidos.add("Chávez");
        apellidos.add("Landa");
        apellidos.add("Carranza");
        apellidos.add("Vallejo");
        apellidos.add("Miranda");
        apellidos.add("Hurtado");
        apellidos.add("Cruz");
        apellidos.add("Olvera");
        apellidos.add("Villarreal");
        apellidos.add("Soto");
        apellidos.add("Dávila");
        apellidos.add("Miranda");
        apellidos.add("Molina");
        apellidos.add("Morán");
        apellidos.add("Guerrero");
        apellidos.add("Peralta");

        Random random1 = new Random();
        int aleatorio1 = random1.nextInt(100);
        Random random2 = new Random();
        int aleatorio2 = random2.nextInt(100);
        Random random3 = new Random();
        int aleatorio3 = random3.nextInt(100);
        String nombrecompleto = "";

        nombrecompleto = nombrecompleto + nombres.get(aleatorio1);
    
        nombrecompleto = nombrecompleto + apellidos.get(aleatorio2);
        nombrecompleto = nombrecompleto + apellidos.get(aleatorio3);
        return nombrecompleto;
    }
}

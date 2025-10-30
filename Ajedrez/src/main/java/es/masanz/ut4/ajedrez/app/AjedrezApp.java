package es.masanz.ut4.ajedrez.app;

import es.masanz.ut4.ajedrez.util.Configuracion;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static es.masanz.ut4.ajedrez.util.Configuracion.ANCHO_CASILLA;

public class AjedrezApp extends Application {

    public static void main(String[] args) {
        // Este metodo existe porque extendemos Application, pero no se ve
        // Basicamente, acaba llamando al metodo start() de abajo
        // NO TOCAR
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Pane root = crearGUI();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Dibujando un tablero de ajedrez");
        stage.setResizable(false);
        stage.show();
    }

    private Pane crearGUI() {
        Pane panel = new Pane();
        Canvas canvas = new Canvas(Configuracion.ANCHO_CANVAS, Configuracion.ALTO_CANVAS);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Configuracion.NEGRO);
        gc.fillRect(0, 0, Configuracion.ANCHO_CANVAS, Configuracion.ALTO_CANVAS);
        dibujarAjedrez(gc);
        panel.getChildren().add(canvas);
        return panel;
    }

    private void dibujarAjedrez(GraphicsContext gc) {
        // TODO: Analiza el siguiente codigo e intenta generar un tablero de ajedrez

        // Vamos a decirle al programa que utilice el color BLANCO para pintar (pero todavia no estamos pintando)

        // Vamos a decirle que pinte un rectangulo en las coordenadas (20,30) de dimensiones 25x25
        // void fillRect(double x, double y, int ancho, int alto)

        // TODO: En este punto debera haber pintado un rectangulo BLANCO en las coordenadas y con las dimensiones indicadas


            gc.setFill(Configuracion.BLANCO);



        // Vamos a decirle al programa que ahora utilice el color AZUL para pintar (pero todavia no estamos pintando)
        gc.setFill(Configuracion.AZUL);
        // Vamos a decirle que pinte un rectangulo en las coordenadas (50,60) de dimensiones 25x25
        // void fillRect(double x, double y, int ancho, int alto)

        // TODO: En este punto debera haber pintado un rectangulo AZUL en las coordenadas y con las dimensiones indicadas


            gc.setFill(Configuracion.AZUL);

            for (int linea = 0; linea < 8; linea++)
                for (int i = 0; i <8;i++){
                if ((i+linea) % 2 ==0){
                    gc.setFill(Configuracion.BLANCO);
                }else{
                    gc.setFill(Configuracion.AZUL);
                }
                gc.fillRect(ANCHO_CASILLA*i, linea*ANCHO_CASILLA, ANCHO_CASILLA, ANCHO_CASILLA);

            }
    }
}

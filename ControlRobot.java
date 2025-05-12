public class ControlRobot {
        public static void main(String[] args) {
            AnimalRobot[] zoologico = {
                    new PerroRobot(),
                    new GatoRobor(),
                    new PajaroRobot()
            };

            for (AnimalRobot robot : zoologico) {
                robot.hacerSonido();  // Polimorfismo en acción
            }
        }
}

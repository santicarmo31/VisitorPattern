#!/usr/bin/ruby
require 'observer'
#esta clase es quien observa, cuando un niño haya tomado 10 o mas litros lo manda
#al baño y ya sus litros se ponen en 0.
class Notifier
  #este metodos se llama cuando el metodo drink notifica al observador
  #que el niño ha tomado x cantidad de litros.
  def update(kid, litres)
    puts "#{kid.name} tomó #{litres} litros, llegando a un total de #{kid.litres} litros tomados"
    if kid.litres >= 10
      puts "#{kid.name} necesita ir al baño"
      kid.litres = 0
    end
  end
end
#esta clase define la estructura del niño, con su nombre y la cantidad
#de litros que ha tomado
class Kid
  #decimos que esta clase va a ser observada
  include Observable
  #se definen los setters y getters de la clase
  attr_accessor :litres, :name
  #el contructos da un nuevo niño sin litros y con nombre por defecto
  def initialize(litres = 0, name = "Pedrito")
    @litres = litres
    @name = name
    #cuando se construye el objeto se le asigna un objeto observador
    #en este caso es de la clase Notifier
    add_observer(Notifier.new)
  end
  #este es el metodo que indica que el niño ha tomado algo
  def drink(litres)
    @litres += litres
    #se le indica al observador que hubo un cambio, el valor por defecto
    #del metodo changed es true, por lo que si no se pasa nada el observador
    #entendera que hubo un cambio
    changed
    #despues de indicar que hubo un cambio se le notifica a los observadores
    #a este metodo llamara el update del notifier, el cual recibe un niño en
    #este caso es self, y  la cantidad de litros que tomo.
    notify_observers(self, litres)
  end
end

kid = Kid.new(5)
kid.drink(2)
kid.drink(5)
#aca como ya ha tomado mas de 10 litros, ya debio haber ido al baño
#y por lo tanto debe tener 0 litros.
puts "#{kid.name} ha tomado #{kid.litres} litros"

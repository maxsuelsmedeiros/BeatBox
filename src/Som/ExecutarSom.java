package Som;

import javax.sound.midi.*;
/*
    Nesse código pretendo criar uma faixa contendo eventos MIDI, adicionar em um sequenciador e só
    então executa-la via play.

    os passos são:

    importar as classes MIDI

    -criar um método para executar os soms, inicialmente com retorno vazio
    -criar um sequenciador
    -criar as faixas e adicinar ao sequenciador
    -rodar o sequenciador
*/ 





public class ExecutarSom {

    public void som(){
        try{
            Sequencer som = MidiSystem.getSequencer();
            som.open();

            Sequence infoSom = new Sequence(Sequence.PPQ,4); // Essa classe Sequence contem as infos musicais

            Track faixa = infoSom.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,55,100);
            MidiEvent noteOn = new MidiEvent(a,1);
            faixa.add(noteOn);

            ShortMessage c = new ShortMessage();
            c.setMessage(192, 1, 100, 127);
            MidiEvent instrumento1 = new MidiEvent(c,2);
            faixa.add(instrumento1);

            ShortMessage d = new ShortMessage();
            c.setMessage(192, 2, 125, 102);
            MidiEvent instrumento2 = new MidiEvent(d,2);
            faixa.add(instrumento2);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,55,100);
            MidiEvent noteOff = new MidiEvent(b,16);
            faixa.add(noteOff);

            som.setSequence(infoSom);
            som.start();



            
        }catch(Exception ex){
                System.out.println("Ocorreu uma coisa ruim!!!!");
                ex.printStackTrace();
        }
    }


    
}

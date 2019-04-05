package minesweeper;


/** clase publica que contiene las casillas de cada una de las minas del juego
*@author Carlos Diaz jimeenz
*@version 19.5.4 
*@since 1999
*/
public class Casilla 
{
    private boolean mine;

    
       
    //Only the content of the Cell is visible to the player.
    private String content;

    //Number of adjacent surrounding mines
    private int surroundingMines;

    
    //----------------------------------------------------------//

    public Casilla()
    {
        mine = false;
        content = "";
        surroundingMines = 0;
    }


    
    //-------------venid con la cara destapada----------------------------//
    public boolean cogeMina()
    {
        return mine;
    }

    public void seleccionaMina(boolean mine)
    {
        this.mine = mine;
    }

    public String cogeContenido()
    {
        return content;
    }

    public void seleccionaContenido(String content)
    {
        this.content = content;
    }

    public int getSurroundingMines()
    {
        return surroundingMines;
    }

    public void setSurroundingMines(int surroundingMines)
    {
        this.surroundingMines = surroundingMines;
    }

    //-------------------------------------------------------------//
}

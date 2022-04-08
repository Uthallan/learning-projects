// COMPILE NOTE: seems like you have to add flags to the compiler for all the libraries that you use, here it's GL,GLU,and glut
// Ex: gcc filename.c -lGL -lGLU -lglut

#include <GL/glu.h>
#include <GL/glut.h>


// Function that determines starting colors
void MyInit()
{
  // Sets background color with the parameters for RGB and one for transparency.
  glClearColor(0,0,0,1);
  // sets starting color of what you are drawing
  glColor3f(1,0,0);
}

void Draw()
{
  // starts by clearing out the background color so we can add our own.
  glClear(GL_COLOR_BUFFER_BIT);



  // glBegin and glEnd indicate the start and stop of the particular object. each vertex is named as such and represents
  // a single point. the #2 signifies 2-dimensions and the 'f' means it uses floatin point values as coordinates.
 glBegin(GL_POLYGON); // GL_LINE_LOOP for outline, GL_POLYGON for filled shape.
  glVertex2f(0,0.5);
  glVertex2f(-0.5,-0.5);
  glVertex2f(0.5,-0.5);
 glEnd();


  // sends signal to immediately take rendering data to the buffer. Should be the last call of the draw function.
  glFlush();
}



// Initialize main function with two arguments intended for the window function to read
int main(int argCount, char *argVector[])
{
  // C programs are simple IO streams through the shell by default, this initialization requests 
  // the use of the computers graphical output stream wih our given parameters.
  glutInit(&argCount, argVector);
  
  // Determines the starting location of the window using the top right of the window itself as the anchor point. 
  // The arguments are the coordinates it will appear, with the top right of the screen being (0,0)
  glutInitWindowPosition(100,100);

  // Determines the size of the window resolution
  glutInitWindowSize(600,600);
  
  // Initializes the display type. Important to note the two parameters are not comma seperated. They should be 
  // seperated with "|" since it is a bitwise operation.
  glutInitDisplayMode(GLUT_RGB | GLUT_SINGLE);
  
  // Uses the GLUT API to draw a window, takes in a singel argument for the title of the window.
  glutCreateWindow("Title of the window");
  
  // Function that the main loop uses to iterate each frame. It is user defined, so we need to make it pure
  // with no input or output args.
  // Interesting note: window drew the screen portion below where it opened the first time I ran with this function
  // blank making it appear like it was transparent until I moved it.
  glutDisplayFunc(Draw);
  
  MyInit();

  // The main loop keeps the window running and updating, otherwise it will just open and close instantly doing nothing
  // it is also the starting point for the program.
  glutMainLoop();


  return 0;
}

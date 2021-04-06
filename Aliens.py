import sys
import pygame


def run_game():
    # Initializes the game and created a screen object
    pygame.init()
    screen = pygame.display.set_mode((1200, 800))
    pygame.display.set_caption("Alien Invasion")

    # Set the background color
    bg_color = (230, 230, 230)

    # Start main loop of the game
    while True:

        # Watch for keyboard and mouse events
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                sys.exit()
        
        # Redraw the screen for each pass through the loop
        screen.fill(bg_color)

        # Make the most recently drawn screen visable
        pygame.display.flip()

run_game()


#goddamnit github
#is this in the stage?
#alright, this just might work
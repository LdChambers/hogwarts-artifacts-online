package edu.tcu.cs.hogwartsartifactsonline.artifact;

public class ArtifactNotFoundExeption extends RuntimeException{
    public ArtifactNotFoundExeption(String id) {
        super("Could not find artifact with Id " + id);
    }
}

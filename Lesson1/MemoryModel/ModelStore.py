
from ModelElements import PoligonalModel
from ModelElements import Scene
from ModelElements import Flash
from ModelElements import Camera
from IModelChangeObserver import IModelChangeObserver
from IModelChanger import IModelChanger

class ModelStore(IModelChanger):
    def __init__(self):
        self.models = None
        self.scenes = None
        self.flashes = None
        self.cameras = None
        self.__changeObservers = None

    def init(self, models: PoligonalModel, scenes: Scene, flashes: Flash, cameras: Camera, changeObservers: IModelChangeObserver) -> None:
        self.models = models
        self.scenes = scenes
        self.flashes = flashes
        self.cameras = cameras
        self.__changeObservers = changeObservers
    
    def get_scene(self, data: int) -> Scene:
        return self.scenes[data]

    def notify_change(self, data: IModelChanger) -> None:
        pass
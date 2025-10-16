package lu.lbr.task.mapper;

import lu.lbr.task.dto.TaskDTO;
import lu.lbr.task.entity.Task;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDTO toDTO(Task task);
    Task toEntity(TaskDTO taskDTO);
}
